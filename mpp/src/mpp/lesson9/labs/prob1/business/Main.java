package labs.prob1.business;

import java.util.*;
import java.util.stream.Collectors;

import labs.prob1.dataaccess.DataAccessFacade;
import labs.prob1.dataaccess.DataAccess;





public class Main {

	public static void main(String[] args) {
		System.out.println(allWhoseZipContains3());
		System.out.println(allHavingAtLeastTwoCopies());
		System.out.println(allHavingMultipleAuthors());

	}
	//Returns a list of all ids of LibraryMembers whose zipcode contains the digit 3
	public static List<String> allWhoseZipContains3() {
		//implement
		DataAccess da = new DataAccessFacade();
		Collection<LibraryMember> members = da.readMemberMap().values();
		List<LibraryMember> mems = new ArrayList<>();
		mems.addAll(members);
		return	mems.stream().
		filter(e -> e.getAddress().getZip().contains("3"))
		.map(e -> e.getMemberId())
		.collect(Collectors.toList());


	}
	//Returns a list of all isbns of books having at least two copies
		public static List<String> allHavingAtLeastTwoCopies() {
			//implement
			DataAccess da = new DataAccessFacade();
			Collection<Book> books = da.readBooksMap().values();
			List<Book> bs = new ArrayList<>();
			bs.addAll(books);

			return bs.stream()
					.filter(a -> a.getCopies().length >=2)
					.map(l ->l.getIsbn())
					.collect(Collectors.toList());

		}

	//Returns a list of all isbns of  Books that have multiple authors
	public static List<String> allHavingMultipleAuthors() {
		//implement
		DataAccess da = new DataAccessFacade();
		Collection<Book> books = da.readBooksMap().values();
		List<Book> bs = new ArrayList<>();
		bs.addAll(books);

		return bs.stream()
				.filter(a->a.getAuthors().size() >1)
				.map(s->s.getIsbn())
				.collect(Collectors.toList());

		}

}
