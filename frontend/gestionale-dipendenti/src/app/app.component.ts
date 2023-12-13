import { Component } from '@angular/core';
import { Dipendente } from './dipendente';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'gestionale-dipendenti';
  dipendente: Dipendente = new Dipendente;
}
