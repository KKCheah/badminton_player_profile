
-- Optional: Ensure the id column is the first column (PostgreSQL does not support reordering columns directly)
CREATE TABLE player (
    id SERIAL PRIMARY KEY,
    name VARCHAR(225),
    age INT
);
