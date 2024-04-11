package study;
public class Company {
	private Queue <Worker> workers;
	public Queue<Worker> getWorkers() {
		return workers;
	}
	public void setWorkers(Queue<Worker> workers) {
		this.workers = workers;
	}
	public void fired (int x, int num) {
		int count = 0;
		workers.insert(null);
		while (workers != null) {
			count++;
			workers.insert(workers.remove());
		}
		workers.remove();
		workers.insert(null);
		for (int i = 0; i < count-num; i++) {
			workers.insert(workers.remove());
		}
		while (workers!=null) {
			workers.remove();
		}
		workers.remove();
	}
	public void q2(Node <Delete> p) {
		while (p != null) {
			fired(p.getValue().getDepartment(),p.getValue().getNumToFire());
			p = p.getNext();
		}
	}
}
