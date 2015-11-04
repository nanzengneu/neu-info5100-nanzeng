package assignment5;

public class HashMap {
	
	private static final int size = 30;
	private Entry table[] = new Entry[size];
	
	class Entry {
		final String key;
		String value;
		Entry next; 
		Entry(String k, String v) {
			key = k;
			value = v; 
		}
		
		public String getValue() {
			return value;
		}
		
		public String getKey() {
			return key;
		}
		
		public void setValue(String value) {
			this.value = value;
		}
		
	}
	
	public Entry get(String k) {
		int hash = k.hashCode() % size;
		Entry e = table[hash];
		while(e != null) {
			if(e.key.equals(k)) {
				return e;
			}
			e = e.next;
		}
		return null;
	}
	
	public void put(String k, String v){
		int hash = k.hashCode() % size;
		Entry e = table[hash]; 
		if(e != null) {
			if(e.key.equals(k)) {
				e.value = v;
			} else {
				while(e.next != null) {
					e = e.next;
				}
				Entry entryInOldBucket = new Entry(k, v);
				e.next = entryInOldBucket;
			}
		} else {
			Entry entryInNewBucket = new Entry(k, v);
			table[hash] = entryInNewBucket;
		}
	}
	
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("Nan", "IS");
		hm.put("Yang", "IS");
		hm.put("Vipin", "EM");
		hm.put("Simon", "CS");
		
		Entry e = hm.get("Nan");
		System.out.println("" + e.getValue());
	}

}
