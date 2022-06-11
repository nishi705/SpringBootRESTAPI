//package com.springrest.springrest.jparepository;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//    @Entity
//    @Data
//    @NoArgsConstructor
//    @AllArgsConstructor
//    public class Employee {
//
//        @Id
//        @GeneratedValue(strategy = GenerationType.IDENTITY)
//        private Integer empId;
//        private String empName;
//        private Double empSal;
//        private String empDept;
//
//        public Integer getEmpId() {
//            return empId;
//        }
//
//        public void setEmpId(Integer empId) {
//            this.empId = empId;
//        }
//
//        public String getEmpName() {
//            return empName;
//        }
//
//        public void setEmpName(String empName) {
//            this.empName = empName;
//        }
//
//        public Double getEmpSal() {
//            return empSal;
//        }
//
//        public void setEmpSal(Double empSal) {
//            this.empSal = empSal;
//        }
//
//        public String getEmpDept() {
//            return empDept;
//        }
//
//        public void setEmpDept(String empDept) {
//            this.empDept = empDept;
//        }
//    }
//
