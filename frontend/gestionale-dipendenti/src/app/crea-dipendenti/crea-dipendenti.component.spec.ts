import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreaDipendentiComponent } from './crea-dipendenti.component';

describe('CreaDipendentiComponent', () => {
  let component: CreaDipendentiComponent;
  let fixture: ComponentFixture<CreaDipendentiComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CreaDipendentiComponent]
    });
    fixture = TestBed.createComponent(CreaDipendentiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
