import logo from "./logo.svg";
import "./App.css";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Movies from "./Components/Movies";
import Chores from "./Components/Chores";
import Navigation from "./Components/Navigation";
import AddMovie from "./Components/AddMovie";

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Navigation/>
        <Routes>
          <Route path="/movies" element={<Movies/>} />
          <Route path="/chores" element={<Chores/>} />
          <Route path="/addMovie" element={<AddMovie/>} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
