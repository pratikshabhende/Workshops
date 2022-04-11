import React from 'react'
import { movieList } from './MovieListComponent'
import "./Movies.css"

let movies = movieList.map((movie) => (<div className="card" style={{width: '18rem'}}>
                <img className="card-img-top" src={movie.url} alt="Card image cap"/>
                <div className="card-body">
                  <p className="card-text">{movie.name}</p>
                </div>
                </div>))

function Movies() {
  return (
    <div>
      <h3>My Movies</h3><br />
        <a href="/addMovie"><button className='btn btn-success'>Add Movie</button></a>
        <br /><br />
        <div  className="container">{movies}</div>
    </div>
  )
}

export default Movies