import Dashboard from "Pages/Dashboard";
import Home from "Pages/Home";
import { BrowserRouter, Switch, Route } from "react-router-dom";

function Routes() {
    return (

        <BrowserRouter>

            <Switch>

                <Route path="/" exact>
                    <Home></Home>
                </Route>
                
                <Route path="/dashboard">
                    <Dashboard></Dashboard>
                </Route>

            </Switch>



        </BrowserRouter>

    );
}

export default Routes;