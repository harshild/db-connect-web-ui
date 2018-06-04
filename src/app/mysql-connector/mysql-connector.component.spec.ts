import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MysqlConnectorComponent } from './mysql-connector.component';

describe('MysqlConnectorComponent', () => {
  let component: MysqlConnectorComponent;
  let fixture: ComponentFixture<MysqlConnectorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MysqlConnectorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MysqlConnectorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
