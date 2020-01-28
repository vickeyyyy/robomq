import { Component, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-emp-create',
  templateUrl: './emp-create.component.html',
  styleUrls: ['./emp-create.component.css']
})
export class EmpCreateComponent {

  enteredId: '';
  enteredName: '';
  enteredSalary: '';
  enteredDepartment: '';
  @Output() empCreated = new EventEmitter();

  onAddEmp() {
    const getEmp = {
      enteredId: this.enteredId,
      enteredName: this.enteredName,
      enteredSalary: this.enteredSalary,
      enteredDepartment: this.enteredDepartment
    };
    this.empCreated.emit(getEmp);
  }

}
