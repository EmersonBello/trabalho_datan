<?php
    class Conta
    {
        public $agencia;
        public $codigo;
        public $data_de_criacao;
        public $titular;
        public $senha;
        public $saldo;
        public $cancelado;

        function retirar($quantia)
        {
            if ($quantia > 0) {
                $this->saldo -= $quantia;
            }
        }

        function depositar($quantia)
        {
            if ($quantia > 0) {
                $this->saldo += $quantia;
            }
        }

        function obterSaldo()
        {
            return $this->saldo;
        }
    }
?>
