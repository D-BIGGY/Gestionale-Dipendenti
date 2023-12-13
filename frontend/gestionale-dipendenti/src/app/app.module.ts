import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { ListaDipendentiComponent } from './lista-dipendenti/lista-dipendenti.component';
import { CreaDipendentiComponent } from './crea-dipendenti/crea-dipendenti.component';
import { ModificaDipendentiComponent } from './modifica-dipendenti/modifica-dipendenti.component';
import { DettagliDipendentiComponent } from './dettagli-dipendenti/dettagli-dipendenti.component';
import { UserPageComponent } from './user-page/user-page.component';
import { AdminPageComponent } from './admin-page/admin-page.component';
import { AdminNavbarComponent } from './admin-navbar/admin-navbar.component';
import { UserNavbarComponent } from './user-navbar/user-navbar.component';



@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    ListaDipendentiComponent,
    CreaDipendentiComponent,
    ModificaDipendentiComponent,
    DettagliDipendentiComponent,
    UserPageComponent,
    AdminPageComponent,
    AdminNavbarComponent,
    UserNavbarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {

}

