package com.brainmentors.ims.students;

import com.brainmentors.common.Person;
import com.brainmentors.ims.staff.FeesCollection;
import com.brainmentors.ims.staff.LibraryManagement;

 public class StudentInfo extends Person {
	/*
	 * 
	 */
	 public void accessLibrary(){
		 System.out.println(super.name);
		 System.out.println(age);
		LibraryManagement lm = new LibraryManagement();
		lm.provideBooks();
		FeesCollection f = new FeesCollection();
		//System.out.println(f.pendingFees);
	}

}
