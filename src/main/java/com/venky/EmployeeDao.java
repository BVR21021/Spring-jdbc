package com.venky;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
	private JdbcTemplate jt;

	@Override
	public String toString() {
		return "AdditonBean [jt=" + jt + "]";
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public void create() {
		jt.execute("create table EmployeeBean(empId number(38),empName varchar2(40),salary number(38))");
		System.out.println("table created...");
	}

	public void insert(EmployeeBean e) {
		int i = jt.update("insert into EmployeeBean values('" + e.getEmpid() + "','" + e.getEmpName() + "','"
				+ e.getSalary() + "')");
		System.out.println(i + "inserted. ..");
	}

	public void update(EmployeeBean e) {
		int i = jt.update("update EmployeeBean set empname='" + e.getEmpName() + "',salary='" + e.getSalary()
				+ "'+ where empId='" + e.getEmpid() + "'");
		System.out.println(i + "updated");
	}

	public void delete(EmployeeBean e) {
		int i = jt.update("delete from EmployeeBean where empId='" + e.getEmpid() + "'");
		System.out.println(i + "deleted........");
	}

}
