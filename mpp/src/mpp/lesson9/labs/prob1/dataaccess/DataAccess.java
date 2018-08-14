package mpp.lesson9.labs.prob1.dataaccess;

import java.util.HashMap;

import mpp.lesson9.labs.prob1.business.Book;
import mpp.lesson9.labs.prob1.business.LibraryMember;

public interface DataAccess { 
	public HashMap<String,Book> readBooksMap();
	public HashMap<String,User> readUserMap();
	public HashMap<String, LibraryMember> readMemberMap();
}
