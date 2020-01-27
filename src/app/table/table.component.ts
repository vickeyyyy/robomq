import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.css']
})
export class TableComponent implements OnInit {
employee = [ {empId: 1001, empName: 'Rahul', empSal: 9000, empDep: 'JAVA', empjoiningdate: '6/12/2014'},
{empId: 1002, empName: 'Vikash', empSal: 11000, empDep: 'ORAAPS', empjoiningdate: '6/12/2017'},
{empId: 1003, empName: 'Uma', empSal: 12000, empDep: 'JAVA', empjoiningdate: '6/12/2010'},
{empId: 1004, empName: 'Sachin', empSal: 11500, empDep: 'ORAAPS', empjoiningdate: '11/12/2017'},
];

  constructor() { }

  ngOnInit() {


}
}