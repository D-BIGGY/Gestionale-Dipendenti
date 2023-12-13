import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router'
import { DipendenteService } from '../dipendente.service';
import { Entrate } from '../entrate';

@Component({
  selector: 'app-user-page',
  templateUrl: './user-page.component.html',
  styleUrls: ['./user-page.component.css']
})
export class UserPageComponent implements OnInit{  
  dataDB: String = "2023-12-13 14:30:00";
  entrata: Entrate = new Entrate();

  constructor(private dipendenteService: DipendenteService,
    private route: ActivatedRoute,
    private router: Router){

  }
  ngOnInit(): void {
    
  }

  entra(){
    console.log("manda");
    this.entrata.idUtenteEntrata = 3;
    this.dipendenteService.createEntrata(this.entrata).subscribe(data => {
      
    })
  }

  esci(){

  }

}

function moment(arg0: number) {
  throw new Error('Function not implemented.');
}

