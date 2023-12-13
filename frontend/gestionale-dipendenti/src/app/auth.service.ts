import { Injectable, forwardRef } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class logGuard implements CanActivate{
  
  utenteloggato = false;
  constructor(private authservice:logGuard) { 

  }
  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): boolean | UrlTree | Observable<boolean | UrlTree> {
    return this.authservice.utentelog();
  }

  utentelog(){
    return this.utenteloggato;
  }  
}

@Injectable({
  providedIn: 'root'
})
export class adminGuard implements CanActivate {
  utenteadmin=false;
  constructor(private authservice:adminGuard) { 

  }
  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {
    
    return this.isAdmin();
  }

  isAdmin(){
    return this.utenteadmin;
  }
}

@Injectable({
  providedIn: 'root'
})
export class entratoGuard implements CanActivate {
  utenteentrato=false;
  constructor(private authservice:entratoGuard) { 

  }
  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {
    
    return this.isEntrato();
  }

  isEntrato(){
    return this.utenteentrato;
  }
}
