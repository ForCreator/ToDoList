package gui.core;

import da.HibernateInit;
import dao.DataTask;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TodoList implements Iterable<String>{

	private List<String> list = new ArrayList<>();



	public void add(String item) {

		list.add(item);
	}

	public void removeAt(int i) {
		if (i >= 0 && i < list.size()) {
			list.remove(i);
		}
		//DataTask dataTask = new DataTask();

	}
	
	public int size() {
		return list.size();
	}
	
	public String elementAt(int i) {

		//dataTask.getAll();
		return list.get(i);
	}
	
	@Override
	public Iterator<String> iterator() {
		return list.iterator();
	}
}
