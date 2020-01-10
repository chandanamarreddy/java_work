package collections;

import java.util.HashSet;

class Student{
		int sno;
		String snames;
		String sadd;
		
		public Student() {
		}
		
		public Student(int sno, String snames, String sadd) {
			this.sno = sno;
			this.snames = snames;
			this.sadd = sadd;
		}
		public int getSno() {
			return sno;
		}
		public void setSno(int sno) {
			this.sno = sno;
		}
		public String getSnames() {
			return snames;
		}
		public void setSnames(String snames) {
			this.snames = snames;
		}
		public String getSadd() {
			return sadd;
		}
		public void setSadd(String sadd) {
			this.sadd = sadd;
		}

		@Override
		public String toString() {
			return "Student [sno=" + sno + ", snames=" + snames + ", sadd=" + sadd + "]";
		}
		
		
}

public class HashsSetDemo {
	public static void main(String args[]) {
		Student sb= new Student(100,"chandana","hyd");
		Student sb1= new Student(200,"harika","hyd");
		Student sb2= new Student(100,"sravani","hyd");
		HashSet <Student>hs=new HashSet<Student>();
		hs.add(sb);
		hs.add(sb1);
		hs.add(sb2);
		System.out.println(hs);
		
		
	}
	
	
}
