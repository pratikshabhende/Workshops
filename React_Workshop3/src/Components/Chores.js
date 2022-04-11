import React from "react";
import { todayChores, tomorrowChores } from "./ChoreListComponent";
import { useState } from "react";

function Chores() {
  const [todChores, updateTodList] = useState(todayChores);
  const [tomChores, updateTomList] = useState(tomorrowChores);

  const doTomorrow = (e) => {
    let chore = e.target.getAttribute("name");

    let newTodChores = todChores.filter((newChore) => newChore != chore);
    console.log(newTodChores);
    tomChores.push(chore);

    updateTodList(newTodChores);
    updateTomList(tomChores);
  };

  const doToday = (e) => {
    let chore = e.target.getAttribute("name");

    let newTomChores = tomChores.filter((newChore) => newChore != chore);
    todChores.push(chore);

    updateTodList(todChores);
    updateTomList(newTomChores);
  };

  return (
    <div>
      <h3>My Chores</h3>
      <div className="container d-inline-flex">
        <table>
          <thead>
            <tr>
              <th>Today's Chores</th>
              <th></th>
            </tr>
          </thead>
          <tbody>
            {todChores.map((chore) => (
              <tr>
                <td>{chore}</td>
                <td>
                  <button name={chore} onClick={doTomorrow}>
                    Do tomorrow
                  </button>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
        <table>
          <thead>
            <tr>
              <th>Tomorrow's Chores</th>
              <th></th>
            </tr>
          </thead>
          <tbody>
            {tomChores.map((chore) => (
              <tr>
                <td>{chore}</td>
                <td>
                  <button name={chore} onClick={doToday}>
                    Do today
                  </button>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
  );
}

export default Chores;
