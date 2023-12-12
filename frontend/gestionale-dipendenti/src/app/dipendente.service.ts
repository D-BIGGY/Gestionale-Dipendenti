import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
//import { Employee } from './employee';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DipendenteService {

  private baseURL = "http://localhost:8080/api/dipendenti"

  constructor(private httpClient: HttpClient) { }

  
  getDipendenteList(): Observable<Dipendente[]>{
    return this.httpClient.get<Dipendente[]>(`${this.baseURL}`)
  }


  createDipendente(employee: Dipendente): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`,dipendente);
  }


  getDipendenteById(id: number): Observable<Dipendente>{
    return this.httpClient.get<Dipendente>(`${this.baseURL}/${id}`)
  }

  updateDipendente(id : number, dipendente: Dipendente): Observable<Object>{
    return this.httpClient.put(`${this.baseURL}/${id}`, employee);
  }


  deleteDipendente(id: number): Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}/${id}`);
  }
}
