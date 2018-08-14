package mpp.lesson9.labs.prob1.business;

import java.util.List;

import mpp.lesson9.labs.prob1.business.Book;
import mpp.lesson9.labs.prob1.dataaccess.DataAccess;
import mpp.lesson9.labs.prob1.dataaccess.DataAccessFacade;

public interface ControllerInterface {
	public void login(String id, String password) throws LoginException;
	public List<String> allMemberIds();
	public List<String> allBookIds();
	
}
