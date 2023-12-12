import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { DipendenteService } from '../dipendente.service';
import { Dipendente } from '../dipendente';

@Component({
  selector: 'app-crea-dipendenti',
  templateUrl: './crea-dipendenti.component.html',
  styleUrls: ['./crea-dipendenti.component.css']
})

export class CreaDipendentiComponent implements OnInit{
  dipendente: Dipendente = new Dipendente;


  constructor(
    private dipendenteService: DipendenteService,
    private router: Router
    ){}


  ngOnInit() {
  }

  saveDipendente(){
    this.dipendenteService.createDipendente(this.dipendente).subscribe( data => {
      console.log(data);
      this.goToDipendentiList();
      
    },
      error => console.log(error));
  }

  goToDipendentiList(){
    this.router.navigate(['/dipendenti']);
  }


  onSubmit(){
    console.log(this.dipendente);
    this.saveDipendente();
    
  }

}
