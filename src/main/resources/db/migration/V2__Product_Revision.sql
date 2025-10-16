CREATE TABLE product
(
    id          DECIMAL      NOT NULL,
    name        VARCHAR(255) NULL,
    price       DECIMAL      NULL,
    category_id BIGINT       NULL,
    CONSTRAINT pk_product PRIMARY KEY (id)
);

ALTER TABLE product
    ADD CONSTRAINT FK_PRODUCT_ON_CATEGORYID FOREIGN KEY (category_id) REFERENCES category (id);