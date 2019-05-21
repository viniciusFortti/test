package br.com.vinicius.Semana2.Clonagem;

public class ClonadoShallow implements Cloneable  {


        // Contained object
        private OriginalShallow original;
        private String name;

        public OriginalShallow getOriginal() {
            return original;
        }

        public void setOriginal(OriginalShallow original) {
            this.original = original;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public ClonadoShallow(String name, String original) {
            this.name = name;
            this.original = new OriginalShallow(original);
        }

        public Object clone() {

            try {
                return super.clone();
            } catch (CloneNotSupportedException e) {
                return null;
            }
        }


}

