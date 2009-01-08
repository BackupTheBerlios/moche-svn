CREATE TABLE issues (
  issue_id serial NOT NULL,
  create_date timestamp with time zone NOT NULL,
  summary character varying(255) NOT NULL,
  short_desc character varying(512) NOT NULL,
  full_desc TEXT,
  current_status integer  not null, -- foreign key
  product_id integer  not null, -- foreign key
  product_version integer  not null, -- foreign key
  product_module integer  not null, -- foreign key
  CONSTRAINT issues_pk PRIMARY KEY (issue_id)
);

