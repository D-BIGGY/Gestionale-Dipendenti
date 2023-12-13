import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DettagliDipendentiComponent } from './dettagli-dipendenti/dettagli-dipendenti.component';
import { ModificaDipendentiComponent } from './modifica-dipendenti/modifica-dipendenti.component';
import { CreaDipendentiComponent } from './crea-dipendenti/crea-dipendenti.component';

const routes: Routes = [
  {path: 'crea-dipendenti', component: CreaDipendentiComponent},
  {path: 'modifica-dipendenti/:id', component: ModificaDipendentiComponent},
  {path: 'dettagli-dipendenti/:id', component: DettagliDipendentiComponent},
  {path: '', redirectTo: 'dipendenti', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
