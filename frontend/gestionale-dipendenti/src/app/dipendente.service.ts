import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Dipendente } from './dipendente';
import { Entrate } from './entrate';
import { Uscite } from './uscite';

@Injectable({
  providedIn: 'root'
})
export class DipendenteService {
  
  private baseURL = "http://localhost:8080/gestionale/api"

  constructor(private httpClient: HttpClient) { }
  
  getDipendenteList(): Observable<Dipendente[]>{
    return this.httpClient.get<Dipendente[]>(`${this.baseURL}/dipendenti`);
  }

  createDipendente(dipendente: Dipendente): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}/aggiungiDipendente`, dipendente);
  }

  getDipendenteById(id: number): Observable<Dipendente>{
    
    return this.httpClient.get<Dipendente>(`${this.baseURL}/dipendente/${id}`);
  }

  updateDipendente(id : number, dipendente: Dipendente): Observable<Object>{
    return this.httpClient.put(`${this.baseURL}/modificaDipendente/${id}`, dipendente);
  }

  deleteDipendente(id: number): Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}/cancellaDipendente/${id}`);
  }

  loginDipendente(dipendente:Dipendente):Observable<Object>{
    return this.httpClient.post(`${this.baseURL}/login`, dipendente);
  }

  getRuolo(dipendente:Dipendente):Observable<Object>{
    return this.httpClient.post(`${this.baseURL}/getRuolo`, dipendente);
  }

  createEntrata(entrata:Entrate){
    return this.httpClient.post(`${this.baseURL}/aggEntrata`, Entrate);
  }

  createUscita(uscita:Uscite){
    return this.httpClient.post(`${this.baseURL}/aggUscita`, Entrate);
  }

  getEntrate(){
    return this.httpClient.get(`${this.baseURL}/entrate`);
  }

  getUscite(){
    return this.httpClient.get(`${this.baseURL}/uscite`);
  }


}
