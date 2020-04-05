db.createUser(
  {
    user: "product",
    pwd: "password",
    roles: [
      {
        role: "readWrite",
        db: "product"
      }
    ]
  }
);
