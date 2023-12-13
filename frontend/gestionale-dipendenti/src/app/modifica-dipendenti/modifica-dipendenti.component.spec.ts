import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ModificaDipendentiComponent } from './modifica-dipendenti.component';

describe('ModificaDipendentiComponent', () => {
  let component: ModificaDipendentiComponent;
  let fixture: ComponentFixture<ModificaDipendentiComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ModificaDipendentiComponent]
    });
    fixture = TestBed.createComponent(ModificaDipendentiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
