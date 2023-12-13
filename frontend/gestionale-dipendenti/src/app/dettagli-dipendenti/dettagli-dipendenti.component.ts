import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { DipendenteService } from '../dipendente.service';
import { Dipendente } from '../dipendente';

@Component({
  selector: 'app-dettagli-dipendenti',
  templateUrl: './dettagli-dipendenti.component.html',
  styleUrls: ['./dettagli-dipendenti.component.css']
})
export class DettagliDipendentiComponent implements OnInit {
  
  id: any;

  dipendente: Dipendente = new Dipendente;

  constructor(
    private route: ActivatedRoute,
    private dipendenteService: DipendenteService
    ){}


  ngOnInit(): void {

    this.id = this.route.snapshot.params['id'];

    this.dipendente = new Dipendente();
    this.dipendenteService.getDipendenteById(this.id).subscribe(data => {
      this.dipendente= data;
    })
  }
}
