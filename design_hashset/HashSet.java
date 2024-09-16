package design_hashset;

import java.util.*;

public class HashSet {
	private Bucket[] BucketArray;
	private int keyRange;
	
	public HashSet()
	{
		this.keyRange= 769;//no of bucket
		this.BucketArray = new Bucket[this.keyRange];
		for(int i=0; i<this.keyRange; i++)
		{
			this.BucketArray[i] = new Bucket();
		}
	}
	//hash function
	protected int hash(int key)
	{
		return (key % this.keyRange);
	}
	
	public void add(int key)
	{
		int bucketIndex = hash(key);
		this.BucketArray[bucketIndex].insert(key);
	}

	public void remove(int key)
	{
		int bucketIndex = hash(key);
		this.BucketArray[bucketIndex].delete(key);
	}
	public boolean contains(int key)
	{
		int bucketIndex = hash(key);
		return this.BucketArray[bucketIndex].exists(key);
	}
}

/*
 Time Complexity: \mathcal{O}(\frac{N}{K})O( 
K
N
​
 ) where NN is the number of all possible values and KK is the number of predefined buckets, which is 769.

Assuming that the values are evenly distributed, thus we could consider that the average size of bucket is \frac{N}{K} 
K
N
​
 .

Since for each operation, in the worst case, we would need to scan the entire bucket, hence the time complexity is \mathcal{O}(\frac{N}{K})O( 
K
N
​
 ).
 */
