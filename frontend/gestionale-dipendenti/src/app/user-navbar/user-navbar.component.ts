import { Component } from '@angular/core';
import { Dipendente } from '../dipendente';

@Component({
  selector: 'app-user-navbar',
  templateUrl: './user-navbar.component.html',
  styleUrls: ['./user-navbar.component.css']
})
export class UserNavbarComponent {
  varnav = 1;
  dipendente: Dipendente = new Dipendente;
  cambiaScheda(index:any){
  this.varnav = index;
  }
}
