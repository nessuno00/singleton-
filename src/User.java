public class User {

    private static User istanza;

        private String nome;
        private int eta;


    private User() {

            this.nome = nome;
            this.eta = eta;
        }

        public static User getIstanza () {


            if (istanza == null) {
                istanza = new User();
            }
            return istanza;
        }

        public String getNome () {
            return nome;
        }

        public void setNome (String nome){
            this.nome = nome;
        }

        public int getEta () {
            return eta;
        }

        public void setEta ( int eta){
            this.eta = eta;
        }

        @Override
        public String toString () {
            return "User{" +
                    "nome='" + this.nome + '\'' +
                    ", eta=" + this.eta +
                    '}';
        }
    }
