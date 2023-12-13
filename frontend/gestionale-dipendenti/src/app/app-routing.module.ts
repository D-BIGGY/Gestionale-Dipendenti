import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DettagliDipendentiComponent } from './dettagli-dipendenti/dettagli-dipendenti.component';
import { ModificaDipendentiComponent } from './modifica-dipendenti/modifica-dipendenti.component';
import { CreaDipendentiComponent } from './crea-dipendenti/crea-dipendenti.component';
import { UserPageComponent } from './user-page/user-page.component';
import { adminGuard, logGuard } from './auth.service';
import { LoginComponent } from './login/login.component';
import { AdminPageComponent } from './admin-page/admin-page.component';
import { AppComponent } from './app.component';

const routes: Routes = [
  {path: 'home', component: AppComponent,canActivate: [logGuard, adminGuard,]},
  {path: 'login', component: LoginComponent,canActivate: [logGuard, adminGuard,]},
  {path: 'crea-dipendenti', component: CreaDipendentiComponent},
  {path: 'area-dipendente', component: UserPageComponent,canActivate: [logGuard, adminGuard,]},
  {path: 'modifica-dipendenti/:id', component: ModificaDipendentiComponent},
  {path: 'dettagli-dipendenti/:id', component: DettagliDipendentiComponent},
  {path: 'admin-area', component: AdminPageComponent,canActivate: [logGuard, adminGuard,]},
  {path: '', redirectTo: 'home', pathMatch: 'full'}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
