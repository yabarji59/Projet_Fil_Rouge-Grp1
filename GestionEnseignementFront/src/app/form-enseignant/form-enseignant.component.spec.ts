import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormEnseignantComponent } from './form-enseignant.component';

describe('DetailsEnseignantComponent', () => {
  let component: FormEnseignantComponent;
  let fixture: ComponentFixture<FormEnseignantComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FormEnseignantComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FormEnseignantComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});