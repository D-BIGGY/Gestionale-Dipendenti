import { Component, OnInit } from '@angular/core';
import { DipendenteService } from '../dipendente.service';
import { Router } from '@angular/router';
import { Dipendente } from '../dipendente';

@Component({
  selector: 'app-lista-dipendenti',
  templateUrl: './lista-dipendenti.component.html',
  styleUrls: ['./lista-dipendenti.component.css']
})
export class ListaDipendentiComponent implements OnInit{
  dipendenti: Dipendente[];

  constructor(private dipendenteService: DipendenteService, private router: Router){

  }

  ngOnInit() {
      this.getDipendenti();
  }

  private getDipendenti(){
    this.dipendenteService.getDipendenteList().subscribe(data => { this.dipendenti = data; });
  }

  dipendenteDettagli(id: number){
    this.router.navigate(['dettagli-dipendenti', id]);
  }

  updateDipendente(id:number){
    this.router.navigate(['modifica-dipendenti', id]);
  }

  deleteDipendente(id: number){
    this.dipendenteService.deleteDipendente(id).subscribe(data => {
      console.log(data);
      this.getDipendenti();
    })
  }


}
