import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router'
import { DipendenteService } from '../dipendente.service';
import { Dipendente } from '../dipendente';

@Component({
  selector: 'app-modifica-dipendenti',
  templateUrl: './modifica-dipendenti.component.html',
  styleUrls: ['./modifica-dipendenti.component.css']
})
export class ModificaDipendentiComponent implements OnInit{
  dipendente: Dipendente = new Dipendente();
  id: number;

  constructor(
    private dipendenteService: DipendenteService,
    private route: ActivatedRoute,
    private router: Router
  ) { }
  ngOnInit() {

    this.dipendente = new Dipendente();

    this.id = this.route.snapshot.params['id'];

    this.dipendenteService.getDipendenteById(this.id)
      .subscribe(data => {
        console.log(data);
        this.dipendente = data;
      }, error => console.log(error)
      );
  }

  updateDipendente() {
    this.dipendenteService.updateDipendente(this.id, this.dipendente)
      .subscribe(data => {
        console.log(data);
        this.dipendente = new Dipendente();
      }, error => console.log(error)
      )

  }

  onSubmit(){
    this.updateDipendente();
    this.goToDipendenteList();
  }


  goToDipendenteList(){
    this.router.navigate(['/dipendenti']);
  }

}
