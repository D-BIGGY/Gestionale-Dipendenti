import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { DipendenteService } from '../dipendente.service';
import { Dipendente } from '../dipendente';
import { FormGroup } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit{
  dipendente2:any;
  dipendente = new Dipendente();
  logged:any;

  ngOnInit(){ 

  }

  constructor(private dipendenteService: DipendenteService,private router: Router){}

  loginsDipendente(form:any){
    console.log("fddfdfd");
    this.dipendente.username = form.value.username;
    this.dipendente.password = form.value.password;
    this.dipendenteService.loginDipendente(this.dipendente).subscribe( data => {
      /*console.log(data.valueOf());
      this.logged = data.split()*/
      console.log("sta per entrare");
      this.prendiRuolo();
      this.logged = data;
    },
      error => console.log(error));
      
  }

  prendiRuolo(){
    console.log("entra?");
    this.dipendenteService.getRuolo(this.dipendente).subscribe( data2 => {
      this.dipendente2 = data2;
      this.dipendente = this.dipendente2;
    },
      error => console.log(error));
      this.goToPagina();
  }

  goToPagina() {
    if(this.logged == true && this.dipendente.ruolo == false){
      console.log("normale" + this.dipendente.ruolo);
      this.router.navigate(['/area-dipendente']);
    }else if(this.logged == true && this.dipendente.ruolo == true){
      
    }
    
  }

}
