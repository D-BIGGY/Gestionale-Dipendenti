import { Component, OnInit } from '@angular/core';
import { Dipendente } from './dipendente';
/*import { logGuard, adminGuard } from './auth.service';*/

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent{

  /*logged:any;
  admin:any;*/

  constructor(/*private logService: logGuard,private adminService: adminGuard*/){
    
  }
  /*ngOnInit(): void {
    this.logged = this.logService.utentelog();
    this.admin = this.adminService.isAdmin();
    console.log(this.logged);
    console.log(this.admin);
  }*/

  title = 'gestionale-dipendenti';
  dipendente: Dipendente = new Dipendente;

}
