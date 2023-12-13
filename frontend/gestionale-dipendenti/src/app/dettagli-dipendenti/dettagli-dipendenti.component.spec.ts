import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DettagliDipendentiComponent } from './dettagli-dipendenti.component';

describe('DettagliDipendentiComponent', () => {
  let component: DettagliDipendentiComponent;
  let fixture: ComponentFixture<DettagliDipendentiComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DettagliDipendentiComponent]
    });
    fixture = TestBed.createComponent(DettagliDipendentiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
