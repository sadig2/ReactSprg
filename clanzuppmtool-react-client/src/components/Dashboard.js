import React, { Component } from "react";
import ProjectItem from "./project/ProjectItem";
import Header from "./layout/Header";

class Dashboard extends Component {
  render() {
    return (
      <div>
        <h1 class="alert alert-warning">Welcome to the Xren</h1>
        <Header />
        <ProjectItem />
      </div>
    );
  }
}

export default Dashboard;
