package z03;

import java.util.Objects;

public class Vector {

    private static class NewVector<X,Y,Z>{

        protected X partX;
        protected Y partY;
        protected Z partZ;

        public NewVector(X partX, Y partY, Z partZ) {
            this.partX = partX;
            this.partY = partY;
            this.partZ = partZ;
        }

        public X getPartX() {
            return partX;
        }

        public void setPartX(X partX) {
            this.partX = partX;
        }

        public Y getPartY() {
            return partY;
        }

        public void setPartY(Y partY) {
            this.partY = partY;
        }

        public Z getPartZ() {
            return partZ;
        }

        public void setPartZ(Z partZ) {
            this.partZ = partZ;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            NewVector<?, ?, ?> newVector = (NewVector<?, ?, ?>) o;
            return Objects.equals(partX, newVector.partX) &&
                    Objects.equals(partY, newVector.partY) &&
                    Objects.equals(partZ, newVector.partZ);
        }

        @Override
        public int hashCode() {

            return Objects.hash(partX, partY, partZ);
        }

        @Override
        public String toString() {
            return "NewVector{" +
                    "partX=" + partX +
                    ", partY=" + partY +
                    ", partZ=" + partZ +
                    '}';
        }
    }

    public static void main(String[] args) {

        NewVector<Integer,Integer,Integer> vectorInt = new NewVector<>(100,200,300);
        NewVector<String,String, String> vectorStr = new NewVector<>("AAAA","BBBB","CCCC");

        System.out.println(vectorInt);
        System.out.println(vectorStr);

    }

}
