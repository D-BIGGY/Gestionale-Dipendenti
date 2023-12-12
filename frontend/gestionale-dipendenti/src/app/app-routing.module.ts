import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListaDipendentiComponent } from './lista-dipendenti/lista-dipendenti.component';
import { DettagliDipendentiComponent } from './dettagli-dipendenti/dettagli-dipendenti.component';
import { ModificaDipendentiComponent } from './modifica-dipendenti/modifica-dipendenti.component';
import { CreaDipendentiComponent } from './crea-dipendenti/crea-dipendenti.component';

const routes: Routes = [
  {path: 'dipendenti', component: ListaDipendentiComponent},
  {path: 'crea-dipendenti', component: CreaDipendentiComponent},
  {path: 'modifica-dipendeti/:id', component: ModificaDipendentiComponent},
  {path: 'dettagli-dipendenti/:id', component: DettagliDipendentiComponent},
  {path: '', redirectTo: 'dipendenti', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
