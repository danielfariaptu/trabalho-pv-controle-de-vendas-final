PGDMP                          v            tavv    10.3    10.3 \    ^           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false            _           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false            `           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                       false            a           1262    16393    tavv    DATABASE     �   CREATE DATABASE tavv WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Portuguese_Brazil.1252' LC_CTYPE = 'Portuguese_Brazil.1252';
    DROP DATABASE tavv;
             postgres    false                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
             postgres    false            b           0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                  postgres    false    3                        3079    12924    plpgsql 	   EXTENSION     ?   CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;
    DROP EXTENSION plpgsql;
                  false            c           0    0    EXTENSION plpgsql    COMMENT     @   COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';
                       false    1            �            1259    16394    cliente    TABLE     !  CREATE TABLE public.cliente (
    cliente_id integer NOT NULL,
    nome character varying(50) NOT NULL,
    limite_de_credito double precision NOT NULL,
    nomefantasia character varying(45),
    cpf character varying(50),
    cnpj character varying(50),
    excluido boolean NOT NULL
);
    DROP TABLE public.cliente;
       public         postgres    false    3            �            1259    16397    cliente_cliente_id_seq    SEQUENCE     �   CREATE SEQUENCE public.cliente_cliente_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE public.cliente_cliente_id_seq;
       public       postgres    false    196    3            d           0    0    cliente_cliente_id_seq    SEQUENCE OWNED BY     Q   ALTER SEQUENCE public.cliente_cliente_id_seq OWNED BY public.cliente.cliente_id;
            public       postgres    false    197            �            1259    16399    compra    TABLE     �   CREATE TABLE public.compra (
    compra_id integer NOT NULL,
    fk_conta_id integer NOT NULL,
    data character varying(20),
    status integer
);
    DROP TABLE public.compra;
       public         postgres    false    3            �            1259    16402    compra_compra_id_seq    SEQUENCE     �   CREATE SEQUENCE public.compra_compra_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 +   DROP SEQUENCE public.compra_compra_id_seq;
       public       postgres    false    198    3            e           0    0    compra_compra_id_seq    SEQUENCE OWNED BY     M   ALTER SEQUENCE public.compra_compra_id_seq OWNED BY public.compra.compra_id;
            public       postgres    false    199            �            1259    16404    compra_fk_conta_id_seq    SEQUENCE     �   CREATE SEQUENCE public.compra_fk_conta_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE public.compra_fk_conta_id_seq;
       public       postgres    false    3    198            f           0    0    compra_fk_conta_id_seq    SEQUENCE OWNED BY     Q   ALTER SEQUENCE public.compra_fk_conta_id_seq OWNED BY public.compra.fk_conta_id;
            public       postgres    false    200            �            1259    16406    conta    TABLE     �   CREATE TABLE public.conta (
    conta_id integer NOT NULL,
    total double precision,
    fk_cliente_id integer NOT NULL,
    data_vencimento character varying(20)
);
    DROP TABLE public.conta;
       public         postgres    false    3            �            1259    16409    conta_conta_id_seq    SEQUENCE     �   CREATE SEQUENCE public.conta_conta_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.conta_conta_id_seq;
       public       postgres    false    3    201            g           0    0    conta_conta_id_seq    SEQUENCE OWNED BY     I   ALTER SEQUENCE public.conta_conta_id_seq OWNED BY public.conta.conta_id;
            public       postgres    false    202            �            1259    16411    conta_fk_cliente_id_seq    SEQUENCE     �   CREATE SEQUENCE public.conta_fk_cliente_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 .   DROP SEQUENCE public.conta_fk_cliente_id_seq;
       public       postgres    false    201    3            h           0    0    conta_fk_cliente_id_seq    SEQUENCE OWNED BY     S   ALTER SEQUENCE public.conta_fk_cliente_id_seq OWNED BY public.conta.fk_cliente_id;
            public       postgres    false    203            �            1259    16413    endereco    TABLE     �  CREATE TABLE public.endereco (
    endereco_id integer NOT NULL,
    logradouro character varying(50) NOT NULL,
    cep character varying(15) NOT NULL,
    numero integer NOT NULL,
    complemento character varying(20) NOT NULL,
    bairro character varying(45) NOT NULL,
    municipio character varying(45) NOT NULL,
    estado character varying(20) NOT NULL,
    tipo_endereco integer NOT NULL,
    excluido boolean NOT NULL,
    fk_cliente_id integer NOT NULL
);
    DROP TABLE public.endereco;
       public         postgres    false    3            �            1259    16416    endereco_endereco_id_seq    SEQUENCE     �   CREATE SEQUENCE public.endereco_endereco_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 /   DROP SEQUENCE public.endereco_endereco_id_seq;
       public       postgres    false    3    204            i           0    0    endereco_endereco_id_seq    SEQUENCE OWNED BY     U   ALTER SEQUENCE public.endereco_endereco_id_seq OWNED BY public.endereco.endereco_id;
            public       postgres    false    205            �            1259    16418    fatura    TABLE     �   CREATE TABLE public.fatura (
    fatura_id integer NOT NULL,
    quantidade_parcelas integer,
    data_quitacao character varying,
    juros double precision,
    conta_id integer NOT NULL
);
    DROP TABLE public.fatura;
       public         postgres    false    3            �            1259    16421    fatura_conta_id_seq    SEQUENCE     �   CREATE SEQUENCE public.fatura_conta_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE public.fatura_conta_id_seq;
       public       postgres    false    206    3            j           0    0    fatura_conta_id_seq    SEQUENCE OWNED BY     K   ALTER SEQUENCE public.fatura_conta_id_seq OWNED BY public.fatura.conta_id;
            public       postgres    false    207            �            1259    16423    fatura_fatura_id_seq    SEQUENCE     �   CREATE SEQUENCE public.fatura_fatura_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 +   DROP SEQUENCE public.fatura_fatura_id_seq;
       public       postgres    false    206    3            k           0    0    fatura_fatura_id_seq    SEQUENCE OWNED BY     M   ALTER SEQUENCE public.fatura_fatura_id_seq OWNED BY public.fatura.fatura_id;
            public       postgres    false    208            �            1259    16425 	   pagamento    TABLE     �   CREATE TABLE public.pagamento (
    pagamento_id integer NOT NULL,
    valor double precision,
    tipo integer,
    juros double precision,
    fk_fatura_id integer NOT NULL,
    status integer
);
    DROP TABLE public.pagamento;
       public         postgres    false    3            �            1259    16428    pagamento_fk_fatura_id_seq    SEQUENCE     �   CREATE SEQUENCE public.pagamento_fk_fatura_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 1   DROP SEQUENCE public.pagamento_fk_fatura_id_seq;
       public       postgres    false    3    209            l           0    0    pagamento_fk_fatura_id_seq    SEQUENCE OWNED BY     Y   ALTER SEQUENCE public.pagamento_fk_fatura_id_seq OWNED BY public.pagamento.fk_fatura_id;
            public       postgres    false    210            �            1259    16430    pagamento_pagamento_id_seq    SEQUENCE     �   CREATE SEQUENCE public.pagamento_pagamento_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 1   DROP SEQUENCE public.pagamento_pagamento_id_seq;
       public       postgres    false    209    3            m           0    0    pagamento_pagamento_id_seq    SEQUENCE OWNED BY     Y   ALTER SEQUENCE public.pagamento_pagamento_id_seq OWNED BY public.pagamento.pagamento_id;
            public       postgres    false    211            �            1259    16432    produto    TABLE     2  CREATE TABLE public.produto (
    codigo_de_barras character varying(45) NOT NULL,
    nome character varying(45),
    preco double precision NOT NULL,
    estoque integer NOT NULL,
    tipo_de_uva character varying(45),
    pais_de_origem character varying(45),
    tipo_de_vinho character varying(45)
);
    DROP TABLE public.produto;
       public         postgres    false    3            �            1259    16435    produto_compra    TABLE     �   CREATE TABLE public.produto_compra (
    produto_compra_id integer NOT NULL,
    compra_id integer,
    codigo_de_barras character varying(45)
);
 "   DROP TABLE public.produto_compra;
       public         postgres    false    3            �            1259    16438 $   produto_compra_produto_compra_id_seq    SEQUENCE     �   CREATE SEQUENCE public.produto_compra_produto_compra_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ;   DROP SEQUENCE public.produto_compra_produto_compra_id_seq;
       public       postgres    false    213    3            n           0    0 $   produto_compra_produto_compra_id_seq    SEQUENCE OWNED BY     m   ALTER SEQUENCE public.produto_compra_produto_compra_id_seq OWNED BY public.produto_compra.produto_compra_id;
            public       postgres    false    214            �            1259    16440    usuario    TABLE     �   CREATE TABLE public.usuario (
    id_login integer NOT NULL,
    nome character varying(50) NOT NULL,
    senha character varying(60) NOT NULL
);
    DROP TABLE public.usuario;
       public         postgres    false    3            �            1259    16443    usuario_id_login_seq    SEQUENCE     �   CREATE SEQUENCE public.usuario_id_login_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 +   DROP SEQUENCE public.usuario_id_login_seq;
       public       postgres    false    215    3            o           0    0    usuario_id_login_seq    SEQUENCE OWNED BY     M   ALTER SEQUENCE public.usuario_id_login_seq OWNED BY public.usuario.id_login;
            public       postgres    false    216            �
           2604    16445    cliente cliente_id    DEFAULT     x   ALTER TABLE ONLY public.cliente ALTER COLUMN cliente_id SET DEFAULT nextval('public.cliente_cliente_id_seq'::regclass);
 A   ALTER TABLE public.cliente ALTER COLUMN cliente_id DROP DEFAULT;
       public       postgres    false    197    196            �
           2604    16446    compra compra_id    DEFAULT     t   ALTER TABLE ONLY public.compra ALTER COLUMN compra_id SET DEFAULT nextval('public.compra_compra_id_seq'::regclass);
 ?   ALTER TABLE public.compra ALTER COLUMN compra_id DROP DEFAULT;
       public       postgres    false    199    198            �
           2604    16447    compra fk_conta_id    DEFAULT     x   ALTER TABLE ONLY public.compra ALTER COLUMN fk_conta_id SET DEFAULT nextval('public.compra_fk_conta_id_seq'::regclass);
 A   ALTER TABLE public.compra ALTER COLUMN fk_conta_id DROP DEFAULT;
       public       postgres    false    200    198            �
           2604    16448    conta conta_id    DEFAULT     p   ALTER TABLE ONLY public.conta ALTER COLUMN conta_id SET DEFAULT nextval('public.conta_conta_id_seq'::regclass);
 =   ALTER TABLE public.conta ALTER COLUMN conta_id DROP DEFAULT;
       public       postgres    false    202    201            �
           2604    16449    conta fk_cliente_id    DEFAULT     z   ALTER TABLE ONLY public.conta ALTER COLUMN fk_cliente_id SET DEFAULT nextval('public.conta_fk_cliente_id_seq'::regclass);
 B   ALTER TABLE public.conta ALTER COLUMN fk_cliente_id DROP DEFAULT;
       public       postgres    false    203    201            �
           2604    16450    endereco endereco_id    DEFAULT     |   ALTER TABLE ONLY public.endereco ALTER COLUMN endereco_id SET DEFAULT nextval('public.endereco_endereco_id_seq'::regclass);
 C   ALTER TABLE public.endereco ALTER COLUMN endereco_id DROP DEFAULT;
       public       postgres    false    205    204            �
           2604    16451    fatura fatura_id    DEFAULT     t   ALTER TABLE ONLY public.fatura ALTER COLUMN fatura_id SET DEFAULT nextval('public.fatura_fatura_id_seq'::regclass);
 ?   ALTER TABLE public.fatura ALTER COLUMN fatura_id DROP DEFAULT;
       public       postgres    false    208    206            �
           2604    16452    fatura conta_id    DEFAULT     r   ALTER TABLE ONLY public.fatura ALTER COLUMN conta_id SET DEFAULT nextval('public.fatura_conta_id_seq'::regclass);
 >   ALTER TABLE public.fatura ALTER COLUMN conta_id DROP DEFAULT;
       public       postgres    false    207    206            �
           2604    16453    pagamento pagamento_id    DEFAULT     �   ALTER TABLE ONLY public.pagamento ALTER COLUMN pagamento_id SET DEFAULT nextval('public.pagamento_pagamento_id_seq'::regclass);
 E   ALTER TABLE public.pagamento ALTER COLUMN pagamento_id DROP DEFAULT;
       public       postgres    false    211    209            �
           2604    16454    pagamento fk_fatura_id    DEFAULT     �   ALTER TABLE ONLY public.pagamento ALTER COLUMN fk_fatura_id SET DEFAULT nextval('public.pagamento_fk_fatura_id_seq'::regclass);
 E   ALTER TABLE public.pagamento ALTER COLUMN fk_fatura_id DROP DEFAULT;
       public       postgres    false    210    209            �
           2604    16455     produto_compra produto_compra_id    DEFAULT     �   ALTER TABLE ONLY public.produto_compra ALTER COLUMN produto_compra_id SET DEFAULT nextval('public.produto_compra_produto_compra_id_seq'::regclass);
 O   ALTER TABLE public.produto_compra ALTER COLUMN produto_compra_id DROP DEFAULT;
       public       postgres    false    214    213            �
           2604    16456    usuario id_login    DEFAULT     t   ALTER TABLE ONLY public.usuario ALTER COLUMN id_login SET DEFAULT nextval('public.usuario_id_login_seq'::regclass);
 ?   ALTER TABLE public.usuario ALTER COLUMN id_login DROP DEFAULT;
       public       postgres    false    216    215            G          0    16394    cliente 
   TABLE DATA               i   COPY public.cliente (cliente_id, nome, limite_de_credito, nomefantasia, cpf, cnpj, excluido) FROM stdin;
    public       postgres    false    196   �h       I          0    16399    compra 
   TABLE DATA               F   COPY public.compra (compra_id, fk_conta_id, data, status) FROM stdin;
    public       postgres    false    198   �h       L          0    16406    conta 
   TABLE DATA               P   COPY public.conta (conta_id, total, fk_cliente_id, data_vencimento) FROM stdin;
    public       postgres    false    201   	i       O          0    16413    endereco 
   TABLE DATA               �   COPY public.endereco (endereco_id, logradouro, cep, numero, complemento, bairro, municipio, estado, tipo_endereco, excluido, fk_cliente_id) FROM stdin;
    public       postgres    false    204   9i       Q          0    16418    fatura 
   TABLE DATA               `   COPY public.fatura (fatura_id, quantidade_parcelas, data_quitacao, juros, conta_id) FROM stdin;
    public       postgres    false    206   wi       T          0    16425 	   pagamento 
   TABLE DATA               [   COPY public.pagamento (pagamento_id, valor, tipo, juros, fk_fatura_id, status) FROM stdin;
    public       postgres    false    209   �i       W          0    16432    produto 
   TABLE DATA               u   COPY public.produto (codigo_de_barras, nome, preco, estoque, tipo_de_uva, pais_de_origem, tipo_de_vinho) FROM stdin;
    public       postgres    false    212   �i       X          0    16435    produto_compra 
   TABLE DATA               X   COPY public.produto_compra (produto_compra_id, compra_id, codigo_de_barras) FROM stdin;
    public       postgres    false    213   6j       Z          0    16440    usuario 
   TABLE DATA               8   COPY public.usuario (id_login, nome, senha) FROM stdin;
    public       postgres    false    215   wj       p           0    0    cliente_cliente_id_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('public.cliente_cliente_id_seq', 8, true);
            public       postgres    false    197            q           0    0    compra_compra_id_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public.compra_compra_id_seq', 1, false);
            public       postgres    false    199            r           0    0    compra_fk_conta_id_seq    SEQUENCE SET     E   SELECT pg_catalog.setval('public.compra_fk_conta_id_seq', 1, false);
            public       postgres    false    200            s           0    0    conta_conta_id_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public.conta_conta_id_seq', 1, false);
            public       postgres    false    202            t           0    0    conta_fk_cliente_id_seq    SEQUENCE SET     F   SELECT pg_catalog.setval('public.conta_fk_cliente_id_seq', 1, false);
            public       postgres    false    203            u           0    0    endereco_endereco_id_seq    SEQUENCE SET     G   SELECT pg_catalog.setval('public.endereco_endereco_id_seq', 37, true);
            public       postgres    false    205            v           0    0    fatura_conta_id_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public.fatura_conta_id_seq', 1, false);
            public       postgres    false    207            w           0    0    fatura_fatura_id_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public.fatura_fatura_id_seq', 1, false);
            public       postgres    false    208            x           0    0    pagamento_fk_fatura_id_seq    SEQUENCE SET     I   SELECT pg_catalog.setval('public.pagamento_fk_fatura_id_seq', 1, false);
            public       postgres    false    210            y           0    0    pagamento_pagamento_id_seq    SEQUENCE SET     I   SELECT pg_catalog.setval('public.pagamento_pagamento_id_seq', 1, false);
            public       postgres    false    211            z           0    0 $   produto_compra_produto_compra_id_seq    SEQUENCE SET     S   SELECT pg_catalog.setval('public.produto_compra_produto_compra_id_seq', 28, true);
            public       postgres    false    214            {           0    0    usuario_id_login_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public.usuario_id_login_seq', 3, true);
            public       postgres    false    216            �
           2606    16458    cliente cliente_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT cliente_pkey PRIMARY KEY (cliente_id);
 >   ALTER TABLE ONLY public.cliente DROP CONSTRAINT cliente_pkey;
       public         postgres    false    196            �
           2606    16460    cliente cnpj 
   CONSTRAINT     G   ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT cnpj UNIQUE (cnpj);
 6   ALTER TABLE ONLY public.cliente DROP CONSTRAINT cnpj;
       public         postgres    false    196            �
           2606    16462    compra compra_pkey 
   CONSTRAINT     W   ALTER TABLE ONLY public.compra
    ADD CONSTRAINT compra_pkey PRIMARY KEY (compra_id);
 <   ALTER TABLE ONLY public.compra DROP CONSTRAINT compra_pkey;
       public         postgres    false    198            �
           2606    16464    conta conta_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.conta
    ADD CONSTRAINT conta_pkey PRIMARY KEY (conta_id);
 :   ALTER TABLE ONLY public.conta DROP CONSTRAINT conta_pkey;
       public         postgres    false    201            �
           2606    16466    cliente cpf 
   CONSTRAINT     E   ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT cpf UNIQUE (cpf);
 5   ALTER TABLE ONLY public.cliente DROP CONSTRAINT cpf;
       public         postgres    false    196            �
           2606    16468    endereco endereco_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY public.endereco
    ADD CONSTRAINT endereco_pkey PRIMARY KEY (endereco_id);
 @   ALTER TABLE ONLY public.endereco DROP CONSTRAINT endereco_pkey;
       public         postgres    false    204            �
           2606    16470    fatura fatura_pkey 
   CONSTRAINT     W   ALTER TABLE ONLY public.fatura
    ADD CONSTRAINT fatura_pkey PRIMARY KEY (fatura_id);
 <   ALTER TABLE ONLY public.fatura DROP CONSTRAINT fatura_pkey;
       public         postgres    false    206            �
           2606    16472    pagamento pagamento_pkey 
   CONSTRAINT     n   ALTER TABLE ONLY public.pagamento
    ADD CONSTRAINT pagamento_pkey PRIMARY KEY (pagamento_id, fk_fatura_id);
 B   ALTER TABLE ONLY public.pagamento DROP CONSTRAINT pagamento_pkey;
       public         postgres    false    209    209            �
           2606    16474    produto produto_pkey 
   CONSTRAINT     `   ALTER TABLE ONLY public.produto
    ADD CONSTRAINT produto_pkey PRIMARY KEY (codigo_de_barras);
 >   ALTER TABLE ONLY public.produto DROP CONSTRAINT produto_pkey;
       public         postgres    false    212            �
           2606    16476    usuario username 
   CONSTRAINT     K   ALTER TABLE ONLY public.usuario
    ADD CONSTRAINT username UNIQUE (nome);
 :   ALTER TABLE ONLY public.usuario DROP CONSTRAINT username;
       public         postgres    false    215            �
           2606    16478    usuario usuario_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY public.usuario
    ADD CONSTRAINT usuario_pkey PRIMARY KEY (id_login);
 >   ALTER TABLE ONLY public.usuario DROP CONSTRAINT usuario_pkey;
       public         postgres    false    215            �
           2606    16479    conta fk_cliente_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.conta
    ADD CONSTRAINT fk_cliente_id FOREIGN KEY (fk_cliente_id) REFERENCES public.cliente(cliente_id);
 =   ALTER TABLE ONLY public.conta DROP CONSTRAINT fk_cliente_id;
       public       postgres    false    201    2738    196            �
           2606    16484    endereco fk_cliente_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.endereco
    ADD CONSTRAINT fk_cliente_id FOREIGN KEY (fk_cliente_id) REFERENCES public.cliente(cliente_id);
 @   ALTER TABLE ONLY public.endereco DROP CONSTRAINT fk_cliente_id;
       public       postgres    false    204    2738    196            �
           2606    16489    compra fk_conta_conta_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.compra
    ADD CONSTRAINT fk_conta_conta_id FOREIGN KEY (fk_conta_id) REFERENCES public.conta(conta_id);
 B   ALTER TABLE ONLY public.compra DROP CONSTRAINT fk_conta_conta_id;
       public       postgres    false    198    2746    201            �
           2606    16494    fatura fk_conta_conta_id    FK CONSTRAINT     ~   ALTER TABLE ONLY public.fatura
    ADD CONSTRAINT fk_conta_conta_id FOREIGN KEY (conta_id) REFERENCES public.conta(conta_id);
 B   ALTER TABLE ONLY public.fatura DROP CONSTRAINT fk_conta_conta_id;
       public       postgres    false    206    2746    201            �
           2606    16499    pagamento fk_fatura_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.pagamento
    ADD CONSTRAINT fk_fatura_id FOREIGN KEY (fk_fatura_id) REFERENCES public.fatura(fatura_id);
 @   ALTER TABLE ONLY public.pagamento DROP CONSTRAINT fk_fatura_id;
       public       postgres    false    2750    209    206            �
           2606    16504 3   produto_compra produto_compra_codigo_de_barras_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.produto_compra
    ADD CONSTRAINT produto_compra_codigo_de_barras_fkey FOREIGN KEY (codigo_de_barras) REFERENCES public.produto(codigo_de_barras);
 ]   ALTER TABLE ONLY public.produto_compra DROP CONSTRAINT produto_compra_codigo_de_barras_fkey;
       public       postgres    false    212    213    2754            �
           2606    16509 ,   produto_compra produto_compra_compra_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.produto_compra
    ADD CONSTRAINT produto_compra_compra_id_fkey FOREIGN KEY (compra_id) REFERENCES public.compra(compra_id);
 V   ALTER TABLE ONLY public.produto_compra DROP CONSTRAINT produto_compra_compra_id_fkey;
       public       postgres    false    2744    198    213            G   /   x�3�I-.I�4400����442�346�314�56��q��qqq ��J      I   0   x�3�4�44�70�720��4�2B0F0A0E0C0G����� Ȗr      L       x�3䴴��4�44�70�720������� 1��      O   .   x�36�4442�T ] ��@`
��������i��\1z\\\ O	@      Q   *   x�3�4�44�70�720��4427�3723�CNC�=... ���      T   -   x�3�4��4���412�3212�#NCNC.#B
	)����� ɻ�      W   8   x�333�4C�N�EI�E�vQb^r>���1'2vL��L��L��B2�J�b���� ��      X   1   x�]�9 0��S)q2口���r��$�w"� _(�h?�X���
�      Z   R   x�3�LL����T1JT14P��,12�Lt�05�*3��2,L�)�+I�wt�
36IOL,Է��NrwJ

4����� 8��     