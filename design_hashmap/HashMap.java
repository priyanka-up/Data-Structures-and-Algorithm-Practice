package design_hashmap;
//chaining - avoid collision
import java.util.*;

public class HashMap {
	
	 private int key_space;
	  private List<Bucket> hash_table;

	  /** Initialize your data structure here. */
	  public HashMap() {
	    this.key_space = 2069;
	    this.hash_table = new ArrayList<Bucket>();
	    for (int i = 0; i < this.key_space; ++i) {
	      this.hash_table.add(new Bucket());
	    }
	  }
	  
	  /** value will always be non-negative. */
	  public void put(int key, int value) {
	    int hash_key = key % this.key_space;
	    this.hash_table.get(hash_key).update(key, value);
	  }
	  
	  /**
	   * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping
	   * for the key
	   */
	  public int get(int key) {
	    int hash_key = key % this.key_space;
	    return this.hash_table.get(hash_key).get(key);
	  }
	  
	  /** Removes the mapping of the specified value key if this map contains a mapping for the key */
	  public void remove(int key) {
	    int hash_key = key % this.key_space;
	    this.hash_table.get(hash_key).remove(key);
	  }
	}


