-- Database: tavv

-- DROP DATABASE tavv;

CREATE DATABASE tavv
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Portuguese_Brazil.1252'
    LC_CTYPE = 'Portuguese_Brazil.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;
	
	-- Table: public.cliente

-- DROP TABLE public.cliente;

CREATE TABLE public.cliente
(
    cliente_id integer NOT NULL DEFAULT nextval('cliente_cliente_id_seq'::regclass),
    nome character varying(50) COLLATE pg_catalog."default" NOT NULL,
    limite_de_credito double precision NOT NULL,
    nomefantasia character varying(45) COLLATE pg_catalog."default",
    cpf character varying(50) COLLATE pg_catalog."default",
    cnpj character varying(50) COLLATE pg_catalog."default",
    excluido boolean NOT NULL,
    CONSTRAINT cliente_pkey PRIMARY KEY (cliente_id),
    CONSTRAINT cnpj UNIQUE (cnpj),
    CONSTRAINT cpf UNIQUE (cpf)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.cliente
    OWNER to postgres;
	
	
-- Table: public.compra

-- DROP TABLE public.compra;

CREATE TABLE public.compra
(
    compra_id integer NOT NULL DEFAULT nextval('compra_compra_id_seq'::regclass),
    fk_conta_id integer NOT NULL DEFAULT nextval('compra_fk_conta_id_seq'::regclass),
    data character varying(20) COLLATE pg_catalog."default",
    status integer,
    total double precision,
    CONSTRAINT compra_pkey PRIMARY KEY (compra_id),
    CONSTRAINT fk_conta_conta_id FOREIGN KEY (fk_conta_id)
        REFERENCES public.conta (conta_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.compra
    OWNER to postgres;
	
	
	
-- Table: public.conta

-- DROP TABLE public.conta;

CREATE TABLE public.conta
(
    conta_id integer NOT NULL DEFAULT nextval('conta_conta_id_seq'::regclass),
    total double precision,
    fk_cliente_id integer NOT NULL DEFAULT nextval('conta_fk_cliente_id_seq'::regclass),
    data_vencimento character varying(20) COLLATE pg_catalog."default",
    CONSTRAINT conta_pkey PRIMARY KEY (conta_id),
    CONSTRAINT fk_cliente_id FOREIGN KEY (fk_cliente_id)
        REFERENCES public.cliente (cliente_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.conta
    OWNER to postgres;
	

-- Table: public.endereco

-- DROP TABLE public.endereco;

CREATE TABLE public.endereco
(
    endereco_id integer NOT NULL DEFAULT nextval('endereco_endereco_id_seq'::regclass),
    logradouro character varying(50) COLLATE pg_catalog."default" NOT NULL,
    cep character varying(15) COLLATE pg_catalog."default" NOT NULL,
    numero integer NOT NULL,
    complemento character varying(20) COLLATE pg_catalog."default" NOT NULL,
    bairro character varying(45) COLLATE pg_catalog."default" NOT NULL,
    municipio character varying(45) COLLATE pg_catalog."default" NOT NULL,
    estado character varying(20) COLLATE pg_catalog."default" NOT NULL,
    tipo_endereco integer NOT NULL,
    excluido boolean NOT NULL,
    fk_cliente_id integer NOT NULL,
    CONSTRAINT endereco_pkey PRIMARY KEY (endereco_id),
    CONSTRAINT fk_cliente_id FOREIGN KEY (fk_cliente_id)
        REFERENCES public.cliente (cliente_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.endereco
    OWNER to postgres;

	
-- Table: public.fatura

-- DROP TABLE public.fatura;

CREATE TABLE public.fatura
(
    fatura_id integer NOT NULL DEFAULT nextval('fatura_fatura_id_seq'::regclass),
    quantidade_parcelas integer,
    data_quitacao character varying COLLATE pg_catalog."default",
    juros double precision,
    conta_id integer NOT NULL DEFAULT nextval('fatura_conta_id_seq'::regclass),
    total double precision,
    CONSTRAINT fatura_pkey PRIMARY KEY (fatura_id),
    CONSTRAINT fk_conta_conta_id FOREIGN KEY (conta_id)
        REFERENCES public.conta (conta_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.fatura
    OWNER to postgres;
	
	
-- Table: public.pagamento

-- DROP TABLE public.pagamento;

CREATE TABLE public.pagamento
(
    pagamento_id integer NOT NULL DEFAULT nextval('pagamento_pagamento_id_seq'::regclass),
    valor double precision,
    tipo integer,
    juros double precision,
    fk_fatura_id integer NOT NULL DEFAULT nextval('pagamento_fk_fatura_id_seq'::regclass),
    status integer,
    CONSTRAINT pagamento_pkey PRIMARY KEY (pagamento_id, fk_fatura_id),
    CONSTRAINT fk_fatura_id FOREIGN KEY (fk_fatura_id)
        REFERENCES public.fatura (fatura_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.pagamento
    OWNER to postgres;
	
-- Table: public.produto

-- DROP TABLE public.produto;

CREATE TABLE public.produto
(
    codigo_de_barras character varying(45) COLLATE pg_catalog."default" NOT NULL,
    nome character varying(45) COLLATE pg_catalog."default",
    preco double precision NOT NULL,
    estoque integer NOT NULL,
    tipo_de_uva character varying(45) COLLATE pg_catalog."default",
    pais_de_origem character varying(45) COLLATE pg_catalog."default",
    tipo_de_vinho character varying(45) COLLATE pg_catalog."default",
    CONSTRAINT produto_pkey PRIMARY KEY (codigo_de_barras)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.produto
    OWNER to postgres;

	
-- Table: public.produto_compra

-- DROP TABLE public.produto_compra;

CREATE TABLE public.produto_compra
(
    produto_compra_id integer NOT NULL DEFAULT nextval('produto_compra_produto_compra_id_seq'::regclass),
    compra_id integer,
    codigo_de_barras character varying(45) COLLATE pg_catalog."default",
    CONSTRAINT produto_compra_codigo_de_barras_fkey FOREIGN KEY (codigo_de_barras)
        REFERENCES public.produto (codigo_de_barras) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT produto_compra_compra_id_fkey FOREIGN KEY (compra_id)
        REFERENCES public.compra (compra_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.produto_compra
    OWNER to postgres;

-- Table: public.usuario

-- DROP TABLE public.usuario;

CREATE TABLE public.usuario
(
    id_login integer NOT NULL DEFAULT nextval('usuario_id_login_seq'::regclass),
    nome character varying(50) COLLATE pg_catalog."default" NOT NULL,
    senha character varying(60) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT usuario_pkey PRIMARY KEY (id_login),
    CONSTRAINT username UNIQUE (nome)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.usuario
    OWNER to postgres;
