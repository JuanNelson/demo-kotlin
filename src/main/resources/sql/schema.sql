CREATE TABLE IF NOT EXISTS student (
  id                     VARCHAR(60)  DEFAULT RANDOM_UUID() PRIMARY KEY,
  name                   VARCHAR      NOT NULL,
  lastName                   VARCHAR      NOT NULL,
  grade                   VARCHAR      NOT NULL,
  age                   INTEGER      NOT NULL
);