import React from "react";
import { useState } from "react";

function AddMovie() {
    const [name, setName] = useState("")
    const [url, setUrl] = useState("")

    const handleSubmit = (e) => {
        e.preventDefault();
        alert("Name : "+name+"   Url : "+ url);
    }

  return (
    <div>
      <h3>Add New Movie</h3>

      <div className="container">
        <form onSubmit={handleSubmit}>
          <div class="form-group">
            <label for="exampleInputEmail1">Movie Name : </label>
            <input
              type="text"
              class="form-control"
              id="name"
              value={name}
              onChange = {(e) => setName(e.target.value)}

            />
          </div>
          <div class="form-group">
            <label for="exampleInputPassword1">Movie Poster url</label>
            <input
              type="text"
              class="form-control"
              id="url"
              value={url}
              onChange = {(e) => setUrl(e.target.value)}
            />
          </div>
          <button type="submit" class="btn btn-primary">
            Submit
          </button>
        </form>
      </div>
    </div>
  );
}

export default AddMovie;
