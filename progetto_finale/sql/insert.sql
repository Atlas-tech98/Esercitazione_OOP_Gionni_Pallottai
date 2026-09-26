INSERT INTO user (username, email, password) VALUES ("admin", "admin@aulab.it", "1234VALUES");

INSERT INTO roles (name) VALUES ("ROLE_ADMIN"), ("ROLE_REVISOR"), ("ROLE_WRITER"), ("ROLE_USER");

INSERT INTO user_roles (user_id, role_id) VALUES (1, 1);

INSERT INTO categories (name) VALUES ("politica"), ("economia"), ("food&drink"),
  ("sport"), ("intrattenimento"), ("tech");