package at.fhj.sodevel2.hiscores.model;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// implementation of the most important mwethods

public class PlayerList implements List<Player> {

	// internal Collection

	private List<Player> players;

	// constr
	public PlayerList() {
		players = new ArrayList<Player>();
	}

	// important Functions
	@Override
	public boolean add(Player e) {
		return players.add(e);
	}

	@Override
	public void clear() {
		this.players.clear();

	}

	@Override
	public boolean contains(Object o) {
	
		return this.players.contains(o);
	}
	
	
	@Override
	public Player get(int index) {
		
		return this.players.get(index);
	}

	@Override
	public int indexOf(Object o) {
	
		 	return this.players.indexOf(o);
	}
	
	
	
	
	
	
	
	
	//------------ TODO, thes functions are not implemented
	

	@Override
	public void add(int index, Player element) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean addAll(Collection<? extends Player> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends Player> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<Player> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<Player> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<Player> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Player remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Player set(int index, Player element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Player> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

}
