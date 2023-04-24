class Solution {
    
    class Car {
        int position;
        int speed;
        public Car(int position, int speed) {
            this.position = position;
            this.speed = speed;
        }
    }
    
    public int carFleet(int target, int[] position, int[] speed) {
        Car[] cars = new Car[position.length];
        for (int i = 0; i < position.length; i++) {
            cars[i] = new Car(position[i], speed[i]);
        }
        
        // sort cars in ascending order by position
        Arrays.sort(cars, (a, b) -> a.position - b.position);
        
        Stack<Double> fleets = new Stack<>();
        for (int i = cars.length - 1; i >= 0; i--) {
            // 이 차가 목표에 도달하기까지 몇 초가 걸리는지 계산한다.
            double time = (double) (target - cars[i].position) / cars[i].speed;
            // 앞에 있는 차한테 갇히는지 확인한다
            if (!fleets.isEmpty() && time <= fleets.peek()) {
                // 뒤에 있는 더 빠른 차량이 앞으로 못가게 하기 위해서 더 느린 자동차의 시간을 스택의 맨 위에 유지한다.
                continue;
            }
            fleets.push(time);
        }
        
        return fleets.size();
    }
}