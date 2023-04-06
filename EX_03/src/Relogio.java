public class Relogio {
        private Ponteiro ponteiroHora;
        private Ponteiro ponteiroMinuto;
        private Ponteiro ponteiroSegundo;

        public Relogio() {
            this.ponteiroHora = new Ponteiro(1);
            this.ponteiroMinuto = new Ponteiro(1);
            this.ponteiroSegundo = new Ponteiro(1);
        }

        public void acertarRelogio(int hora, int minuto, int segundo) {
            if (hora >= 1 && hora <= 12) {
                this.ponteiroHora.setPosicao(hora);
            }
            if (minuto >= 0 && minuto <= 59) {
                this.ponteiroMinuto.setPosicao(minuto / 5 + 1);
            }
            if (segundo >= 0 && segundo <= 59) {
                this.ponteiroSegundo.setPosicao(segundo / 5 + 1);
            }
        }

        public int lerHora() {
            return this.ponteiroHora.getPosicao();
        }

        public int lerMinuto() {
            return (this.ponteiroMinuto.getPosicao() - 1) * 5;
        }

        public int lerSegundo() {
            return (this.ponteiroSegundo.getPosicao() - 1) * 5;
        }
}
